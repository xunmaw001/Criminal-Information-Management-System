const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"入狱登记","menuJump":"列表","tableName":"ruyudengji"}],"menu":"入狱登记管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"健康登记","menuJump":"列表","tableName":"jiankangdengji"}],"menu":"健康登记管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"改造信息","menuJump":"列表","tableName":"gaizaoxinxi"}],"menu":"改造信息管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"出狱登记","menuJump":"列表","tableName":"chuyudengji"}],"menu":"出狱登记管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"筛选类型","menuJump":"列表","tableName":"shaixuanleixing"}],"menu":"筛选类型管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","健康登记","改造信息","出狱登记"],"menu":"入狱登记","menuJump":"列表","tableName":"ruyudengji"}],"menu":"入狱登记管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"健康登记","menuJump":"列表","tableName":"jiankangdengji"}],"menu":"健康登记管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"改造信息","menuJump":"列表","tableName":"gaizaoxinxi"}],"menu":"改造信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"出狱登记","menuJump":"列表","tableName":"chuyudengji"}],"menu":"出狱登记管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"用户","tableName":"yonghu"}]
    }
}
export default menu;
