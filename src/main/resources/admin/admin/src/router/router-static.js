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
    import putongguanliyuan from '@/views/modules/putongguanliyuan/list'
    import discussjiaoshi from '@/views/modules/discussjiaoshi/list'
    import kecheng from '@/views/modules/kecheng/list'
    import kechengguanliyuan from '@/views/modules/kechengguanliyuan/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import storeup from '@/views/modules/storeup/list'
    import mingshi from '@/views/modules/mingshi/list'
    import discusskecheng from '@/views/modules/discusskecheng/list'
    import kechengfenlei from '@/views/modules/kechengfenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jiangshi from '@/views/modules/jiangshi/list'
    import discussmingshi from '@/views/modules/discussmingshi/list'
    import orders from '@/views/modules/orders/list'
    import config from '@/views/modules/config/list'


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
	path: '/putongguanliyuan',
        name: '普通管理员',
        component: putongguanliyuan
      }
      ,{
	path: '/discussjiaoshi',
        name: '教师评论',
        component: discussjiaoshi
      }
      ,{
	path: '/kecheng',
        name: '课程',
        component: kecheng
      }
      ,{
	path: '/kechengguanliyuan',
        name: '课程管理员',
        component: kechengguanliyuan
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/mingshi',
        name: '名师',
        component: mingshi
      }
      ,{
	path: '/discusskecheng',
        name: '课程评论',
        component: discusskecheng
      }
      ,{
	path: '/kechengfenlei',
        name: '课程分类',
        component: kechengfenlei
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jiangshi',
        name: '讲师',
        component: jiangshi
      }
      ,{
	path: '/discussmingshi',
        name: '名师评论',
        component: discussmingshi
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
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
