<template>
  <div class="hello">
    <h1>{{ msg }}</h1>

    <h3>Navigate to:</h3>
    <ul>
      <li><a href="http://localhost:7071/gateway/products" >Products</a></li>
      <li><a href="http://localhost:7071/gateway/prices" >Prices</a></li>
    </ul>

  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
