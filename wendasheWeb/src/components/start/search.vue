<template>
    <div class="search_all">
        <div class="serach_box">
            
        </div>
    </div>
</template>
<script setup>
import { ref } from 'vue'
const search = ref('')
</script>
<style scoped>
.search_all{
    width:100vw;
    height:100vh;
    display: flex;
    justify-content: center;
}
.serach_box{
    width:80vh;
    height:10vh;
    margin-top: 5%;
    display: flex;
    justify-content: space-between;
}
</style>