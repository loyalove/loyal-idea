package com.loyalove.idea.pojo.po

import com.loyalove.idea.pojo.annotations.Pojo

/**
 * Title: com.loyalove.idea.pojo.po.UserPO.java
 * Description: TODO
 * Company: ysh
 * @author: sailuo@yiji.com
 * @date: 2017-08-10 11:08
 */

@Pojo
data class UserPO(var username: String?) {
    var msg: String? = null
    var age: Int? = null
}