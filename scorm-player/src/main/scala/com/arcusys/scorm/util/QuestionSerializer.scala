package com.arcusys.scorm.util

import com.arcusys.scorm.model.quiz._

object QuestionSerializer {
  def getTypeIDByEntity(entity: AnyRef) = {
    entity match {
      case e:ChoiceQuestion => 0
      case e:ShortAnswerQuestion => 1
      case e:NumericQuestion => 2
      case e:PositioningQuestion => 3
      case e:MatchingQuestion => 4
      case e:EssayQuestion => 5
      case e:EmbeddedAnswerQuestion => 6
      case _ => -1
    }
  }
  
  def buildItemMap(question: Question[Answer]) = {
    def buildAnswersData = {
      JSON.toJSON(question match {
          case e:ChoiceQuestion => 
            for (answer<-e.answers) yield Map("text"->answer.text, "isCorrect"->answer.isCorrect)
          case e:ShortAnswerQuestion => 
            for (answer<-e.answers) yield Map("text"->answer.text)
          case e:NumericQuestion => 
            for (answer<-e.answers) yield Map("rangeFrom"->answer.range._1, "rangeTo"->answer.range._2)
          case e:PositioningQuestion => 
            for (answer<-e.answers) yield Map("text"->answer.text, "isCorrect"->answer.isCorrect)
          case e:MatchingQuestion => 
            for (answer<-e.answers) yield Map("text"->answer.text, "subquestionText"->answer.subquestionText.getOrElse(""))
          case e:EssayQuestion => Seq[Map[String,Any]]()
          case e:EmbeddedAnswerQuestion => Seq[Map[String,Any]]()
          case _ => throw new Exception("Service: Oops! Can't recognize question type")
        }).replaceAll("\"", "'")
    }
    
    val isBounded = question match {
      case e:ChoiceQuestion => e.isBounded
      case e:PositioningQuestion => e.isBounded
      case _ => false
    }
    
    val isCaseSensitive = question match {
      case e:ShortAnswerQuestion => e.isCaseSensitive
      case _ => false
    }
    
    Map("attr"->Map("id"->question.id, 
                    "rel"->"default", 
                    "text"->question.text,
                    "isBounded"->isBounded,
                    "isCaseSensitive"->isCaseSensitive,
                    "answers"->buildAnswersData,
                    "questionType"->getTypeIDByEntity(question),
                    "categoryID"->question.categoryID.getOrElse(-1)),
        "data"->question.title)
  }
  
  //[{attr:{"id":_id, "rel":"folder"}, "data":_name,"state":"closed"}]
  def buildOutputJSON(dataSeq:Seq[Question[Answer]]) = {
    (for(question<-dataSeq) yield buildItemMap(question))
  }
}