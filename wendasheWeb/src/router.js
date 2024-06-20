import { createRouter, createWebHistory } from 'vue-router'
import search from './components/start/search.vue'
import login from './components/login/login.vue'
import home from './components/home.vue'
import enroll from './components/login/enroll.vue'

const routes = createRouter({
    history: createWebHistory(),
    routes: [
        {path:'/',component:search},
        {path:'/login',component:login},
        {path:'/home',component:home},
        {path:'/enroll',component:enroll},
    ]
})
export default routes