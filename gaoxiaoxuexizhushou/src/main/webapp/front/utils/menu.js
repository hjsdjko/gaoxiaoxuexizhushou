const menu = {
    list() {
        return [
    {
        "backMenu":[
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    },
    {
        "backMenu":[
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除"
                        ],
                        "menu":"作业回答",
                        "menuJump":"列表",
                        "tableName":"huida"
                    }
                ],
                "menu":"作业回答"
            }
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"教师评论信息",
                        "menuJump":"列表",
                        "tableName":"jiaoshiLiuyan"
                    }
                ],
                "menu":"我的教师评论信息"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                        ],
                        "menu":"课程信息",
                        "menuJump":"列表",
                        "tableName":"kecheng"
                    }
                ],
                "menu":"课程信息"
            }
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"课程信息评论信息",
                        "menuJump":"列表",
                        "tableName":"kechengLiuyan"
                    }
                ],
                "menu":"我的课程信息评论信息"
            }
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"公告信息管理",
                        "menuJump":"列表",
                        "tableName":"news"
                    }
                ],
                "menu":"公告信息"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                        ],
                        "menu":"作业",
                        "menuJump":"列表",
                        "tableName":"zuoye"
                    }
                ],
                "menu":"作业"
            }
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"作业评论信息",
                        "menuJump":"列表",
                        "tableName":"zuoyeLiuyan"
                    }
                ],
                "menu":"我的作业评论信息"
            }
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"是",
        "hasFrontRegister":"是",
        "roleName":"学生",
        "tableName":"yonghu"
    }
]

	}
}
export default menu;
