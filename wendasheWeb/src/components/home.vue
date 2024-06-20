<template>
    <div class="home_box">
        <div class="home_tab">
            <el-avatar class="home_avatar" :size="40" src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png" />
            <el-tabs v-model="activeName" class="demo-tabs" >
                <el-tab-pane label="首页" name="first">
                    <div class="shouye">
                        <form action="" class="search_input_box">
                            <input type="text" class="search_input" placeholder="请输入关键字">
                            <el-button type="primary" :icon="Search" class="search_btn" size="large">搜索</el-button>
                        </form>
                        <div class="new_box">
                            <div class="hot_new"></div>
                            <div class="history_info"></div>
                        </div>
                    </div>
                </el-tab-pane>
                <el-tab-pane label="动态" name="second">
                    <div class="dongtai">

                    </div>
                </el-tab-pane>
                <el-tab-pane label="社区" name="third">
                    <div class="shequ">

                    </div>
                </el-tab-pane>
            </el-tabs>
        </div>
    </div>
</template>
<script setup>
import { ref } from 'vue'
import { Search } from '@element-plus/icons-vue'
const activeName = ref('first')
</script>
  
<style>
.home_box {
    width: 100%;
    height: 100vw;
    display: flex;
    justify-content: center;
    align-items: center;
}
.home_tab{
    width:80%;
    height:100vw;
    position: absolute;
}
.home_avatar{
    position: absolute;
    right: 0;
}
.demo-tabs > .el-tabs__content {
    padding: 32px;
    color: #6b778c;
    font-size: 32px;
    font-weight: 600;
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
    --el-button-size:5vh !important;
    width:5vw;
    margin-left: 10px;;
}
.new_box{
    width:100%;
    height:50vh;
    margin-top: 10px    ;
    display: flex;
}
.hot_new{
    width:70%;
    height:50vh;
    left:0;
    background-color: aliceblue;
}
.history_info
{
    width:30%;
    height:50vh;
    right:0;
    background-color: #6b778c;
}
</style>
  