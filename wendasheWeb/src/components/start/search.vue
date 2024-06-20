<template>
    <div class="search_all">
    <el-menu
    :default-active="activeIndex"
    class="el-menu-demo"
    mode="horizontal"
    @select="handleSelect"
  >
    <el-menu-item index="1"><router-link to="/home">首页</router-link></el-menu-item>
    <el-menu-item index="2" class="login_btn"><router-link to="/login">登录/注册</router-link></el-menu-item>
  </el-menu>
        <form action="" class="search_input_box">
            <input type="text" class="search_input" placeholder="请输入关键字">
            <el-button type="primary" :icon="Search" class="search_btn">搜索</el-button>
        </form>
    </div>
</template>
<script setup>
import { Search } from '@element-plus/icons-vue'
</script>
<style scoped>
.search_all{
    width: 100%;
    height: 100%;
    background: #fff;
}
.login_btn{
    position: absolute;
    right:0;
}
.search_input_box{
    width: 100%;
    height:10vh;
    display: flex;
    justify-content: center;
    align-items: center;
}
.search_input{
    width: 80%;
    height: 5vh;
    font-size: 20px;
    padding-left: 20px;
}
.search_btn{
    height:5vh;
    width:5vw;
    margin-left: 10px;;
}
</style>