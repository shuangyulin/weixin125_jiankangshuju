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
    import jiankangxinxigongxiang from '@/views/modules/jiankangxinxigongxiang/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jiankangshuju from '@/views/modules/jiankangshuju/list'
    import shujufenxi from '@/views/modules/shujufenxi/list'
    import discussjiankangxinxigongxiang from '@/views/modules/discussjiankangxinxigongxiang/list'
    import discussjiankangjihua from '@/views/modules/discussjiankangjihua/list'
    import jiankangjihua from '@/views/modules/jiankangjihua/list'
    import config from '@/views/modules/config/list'
    import discusszhishikepu from '@/views/modules/discusszhishikepu/list'
    import zhishikepu from '@/views/modules/zhishikepu/list'


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
    }
      ,{
	path: '/jiankangxinxigongxiang',
        name: '健康信息共享',
        component: jiankangxinxigongxiang
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jiankangshuju',
        name: '健康数据',
        component: jiankangshuju
      }
      ,{
	path: '/shujufenxi',
        name: '数据分析',
        component: shujufenxi
      }
      ,{
	path: '/discussjiankangxinxigongxiang',
        name: '健康信息共享评论',
        component: discussjiankangxinxigongxiang
      }
      ,{
	path: '/discussjiankangjihua',
        name: '健康计划评论',
        component: discussjiankangjihua
      }
      ,{
	path: '/jiankangjihua',
        name: '健康计划',
        component: jiankangjihua
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discusszhishikepu',
        name: '知识科普评论',
        component: discusszhishikepu
      }
      ,{
	path: '/zhishikepu',
        name: '知识科普',
        component: zhishikepu
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
