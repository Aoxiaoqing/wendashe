<template>
    <div class="enroll_box">
        <div class="enroll_form_box">
            <el-form style="max-width: 600px" :model="enroll_data" status-icon :rules="rules" label-width="auto">
                <div class="logo"><h2>注册账号</h2></div>
                <el-form-item label="账号：" prop="account">
                    <el-input v-model="enroll_data.account" placeholder="请输入账号" class="account_input"></el-input>
                </el-form-item>
                <el-form-item label="密码：" prop="password">
                    <el-input v-model="enroll_data.password" placeholder="请输入密码" type="password" class="password_input"></el-input>
                </el-form-item> 
                <el-form-item label="确认密码：" prop="repassword">
                    <el-input v-model="enroll_data.repassword" placeholder="再次确认密码" type="password" class="password_input"></el-input>
                </el-form-item> 
                <el-button type="submit" class="enroll_button" @click="enroll_submit">注册</el-button>
                <div class="other_link">
                    <div></div>
                    <router-link to="/login" class="login">去登录</router-link>
                </div>
            </el-form>
        </div>
    </div>
</template>
<script setup>
import { ref } from 'vue';
import request from '../axios/request.js'
request({
    url: 'http://localhost:8080/user/enroll',
    method: 'get',
    params: {enroll_data}
}).then(res => {
    console.log(res);
}).catch(err => {
    console.log(err);
})
const enroll_data = ref({
    account: '',
    password: '',
    repassword: ''
})
const validatePass = (rule, value, callback) => {
    if (value === '') {
        callback(new Error('请再次输入密码'));
    } else if (value !== enroll_data.value.password) {
        callback(new Error('两次输入密码不一致!'));
    } else {
        callback();
    }
};
const rules = {
    account: [
        { required: true, message: '请输入账号', trigger: 'blur' },
        { min: 5, max: 10, message: '长度在 5 到 10 个字符', trigger: 'blur' }
    ],
    password: [
        { required: true, message: '请输入密码', trigger: 'blur' },
        { min: 6, max: 15, message: '密码长度在6到15个字符', trigger: 'blur' },
    ],
    repassword: [
        {validator: validatePass, trigger: 'blur'}
    ]
};
</script>
<style scoped>
.enroll_box{
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
.enroll_form_box{
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
.enroll_button{
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