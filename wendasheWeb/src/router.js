import { createRouter, createWebHistory } from 'vue-router'
import search from './components/start/search.vue'

const routes = createRouter({
    history: createWebHistory(),
    routes: [{path:'/',component:search}]
})
export default routes