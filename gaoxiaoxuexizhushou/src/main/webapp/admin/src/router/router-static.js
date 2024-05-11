import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import huida from '@/views/modules/huida/list'
    import jiaoanxinxi from '@/views/modules/jiaoanxinxi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import jiaoshiLiuyan from '@/views/modules/jiaoshiLiuyan/list'
    import kecheng from '@/views/modules/kecheng/list'
    import kechengLiuyan from '@/views/modules/kechengLiuyan/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zuoye from '@/views/modules/zuoye/list'
    import zuoyeLiuyan from '@/views/modules/zuoyeLiuyan/list'
    import config from '@/views/modules/config/list'
    import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryHuida from '@/views/modules/dictionaryHuida/list'
    import dictionaryJiaoanxinxi from '@/views/modules/dictionaryJiaoanxinxi/list'
    import dictionaryKecheng from '@/views/modules/dictionaryKecheng/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryZuoye from '@/views/modules/dictionaryZuoye/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBanji',
        name: '班级',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryHuida',
        name: '批改状态',
        component: dictionaryHuida
    }
    ,{
        path: '/dictionaryJiaoanxinxi',
        name: '教案类型',
        component: dictionaryJiaoanxinxi
    }
    ,{
        path: '/dictionaryKecheng',
        name: '资源类型',
        component: dictionaryKecheng
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryZuoye',
        name: '作业类型',
        component: dictionaryZuoye
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/huida',
        name: '回答',
        component: huida
      }
    ,{
        path: '/jiaoanxinxi',
        name: '教案信息',
        component: jiaoanxinxi
      }
    ,{
        path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
    ,{
        path: '/jiaoshiLiuyan',
        name: '教师评论',
        component: jiaoshiLiuyan
      }
    ,{
        path: '/kecheng',
        name: '课程信息',
        component: kecheng
      }
    ,{
        path: '/kechengLiuyan',
        name: '课程信息评论',
        component: kechengLiuyan
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/yonghu',
        name: '学生',
        component: yonghu
      }
    ,{
        path: '/zuoye',
        name: '作业',
        component: zuoye
      }
    ,{
        path: '/zuoyeLiuyan',
        name: '作业评论',
        component: zuoyeLiuyan
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
