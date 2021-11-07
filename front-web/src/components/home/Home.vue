<template>
    <div>
        <ul>
            <li v-for="estado of estados">{{ estado.nome }}</li>
        </ul>
    </div>
</template>

<script>
export default {
    data(){
        return {
            estados: []
        }
    },
    created() {
        this.$http.get('http://localhost:8080/estados')
        .then(res => res.json())
        .then(estados => this.estados = estados, err => console.log(err));
    } 
  }
</script>

<style lang="scss">

</style>