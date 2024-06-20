<template>
    <div class="problem_all">
        <div class="problem_main">
            <el-input
            v-model="textarea"
            style="width: 240px"
            :rows="2"
            type="textarea"
            placeholder="Please input"/>
            <el-button type="primary">提交</el-button>
        </div>
    </div>
</template>
<script setup>
import { ref } from 'vue';
const textarea = ref('')
</script>