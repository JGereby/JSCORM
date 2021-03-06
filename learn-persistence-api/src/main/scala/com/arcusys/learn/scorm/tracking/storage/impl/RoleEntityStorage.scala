package com.arcusys.learn.scorm.tracking.storage.impl

import com.arcusys.learn.scorm.tracking.model.{PermissionType, Role}
import com.arcusys.learn.storage.impl.{KeyedEntityStorageExt, EntityStorageExt}
import com.arcusys.learn.scorm.tracking.storage.RoleStorage

/**
 * User: Yulia.Glushonkova
 * Date: 28.03.13
 */
trait RoleEntityStorage  extends RoleStorage with KeyedEntityStorageExt[Role] with EntityStorageExt[Role] {

  def delete(liferayRoleID: Int, permission: PermissionType.Value){
    delete("liferayRoleID"->liferayRoleID, "permission"-> permission.toString)
  }

  def getForPermission(permission: PermissionType.Value): Seq[Role] = {
    getAll("permission"-> permission.toString)
  }
  def getDefault(permission: PermissionType.Value): Option[Role]={
    getAll("permission"-> permission.toString, "isDefault"-> true).headOption
  }

  def update(id: Int, permission: PermissionType.Value,  isDefault: Boolean){
    if (isDefault) modify("_cleanIsDefault", "permission" -> permission.toString)
    modify("id" -> id, "isDefault"->isDefault)
  }
}
