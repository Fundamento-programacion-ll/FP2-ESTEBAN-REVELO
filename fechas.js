const moment = require('moment');
var fecha = new Date();
moment.local('es');
console.log(fecha);
console.log(fecha.getDate());
console.log(fecha.getMonth());
console.log(fecha.getFullYear());

console.log(moment().formart('dddd'));
console.log(horaActual);
console.log(moment().subtract(3,'hours').toString());

console.log(fecha.toString());
console.log(fecha.toDateString());
console.log(fecha.toUTCString());

console.log(moment().startOf('hour'),toString());


