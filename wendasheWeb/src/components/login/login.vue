<template>
    <div class="login_box">
        <div class="login_form_box">
            <el-form style="max-width: 600px" :model="login_data" status-icon :rules="rules" label-width="auto">
                <div class="logo"><h2>登录账号</h2></div>
                <el-form-item label="账号：" prop="account">
                    <el-input v-model="login_data.account" placeholder="请输入账号" class="account_input" autocomplete="off"></el-input>
                </el-form-item>
                <el-form-item label="密码：" prop="password">
                    <el-input v-model="login_data.password" placeholder="请输入密码" type="password" class="password_input"></el-input>
                </el-form-item> 
                <el-button type="submit" @click="submit_form" class="login_button">登录</el-button>
                <el-form-item>
                    <div class="other_link">
                        <router-link to="/forget" class="forget">忘记密码</router-link>
                        <router-link to="/enroll" class="enroll">去注册</router-link>
                    </div>
                </el-form-item>
            </el-form>
        </div>
    </div>
</template>
<script setup>
import { ref } from 'vue';
const login_data = ref({
    account:'',
    password:''
})
const rules = {
    account: [
        { required: true, message: '请输入账号', trigger: 'blur' },
        { min:5, max: 10, message: '账号长度在5到10个字符', trigger: 'blur' },
    ],
    password: [
        { required: true, message: '请输入密码', trigger: 'blur' },
        { min: 6, max: 15, message: '密码长度在6到15个字符', trigger: 'blur' },
]
}
</script>
<style scoped>
.login_box{
    width: 100%;
    height: 100vh;
    background-color: #ecf0f3;
    box-shadow: 10px 10px 10px #d1d9e6, -10px -10px 10px #f9f9f9;
    border-radius: 12px;
    overflow: hidden;
    display: flex;
    justify-content: center;
    align-items: center;
}
.login_form_box{
    width: 30%;
    height: 50%;
    background-color: #fff;
    padding: 20px;
    border-radius: 12px;
    box-shadow: 10px 10px 10px #d1d9e6, -10px -10px 10px #f9f9f9;
    display: flex;
    justify-content: center;
    align-items: center;
    position: absolute;
}
h2{
    margin-bottom: 20px;
}
.logo{
    display: flex;
    justify-content: center;
    align-items: center;
    margin-bottom: 20px;
}
.login_button{
    width:100%;
    margin-top: 20px;
    margin-bottom: 20px;
}
.other_link{
    width:100%;
    display: flex;
    justify-content: space-between;
}
.other_link a{
    text-decoration: none;
    color:#666;
}
.other_link a:hover{
    color:#000;
}
.other_link a:active{
    color:#000;
}
.other_link a:visited{
    color:#666;
}
</style>