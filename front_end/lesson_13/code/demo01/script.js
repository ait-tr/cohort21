/*
console.log("1. строка 1");
setTimeout(()=>console.log("задача через 5 секунд"), 5000);
console.log("2. строка 2");
setTimeout(()=>console.log("задача через 2 секунд"), 2000);
console.log("3. строка 3");
setTimeout(()=>console.log("задача через 0 секунд"), 0);


let idTimer = setInterval(()=>{
    console.log("строка");
},1000);

setTimeout(()=>clearInterval(idTimer),7_000);



let timer = setTimeout( function t(){
    console.log("timer");
    timer= setTimeout(t,1000);
}, 1000);
setTimeout(()=>clearInterval(timer),10_000);

*/


let server= true;

// при создание промиса в конструктор передается функция
// resolve, reject - фуекции, которые реализует JS (самим не надо!!)
//                   мы их только вызываем в теле промиса
let promise = new Promise(function(resolve, reject){
    console.log("Отправляем запрос на сервер ................");
    if(server){
        
        setTimeout(()=>{
            let data ={
                firstName: "Jack",
                lastName: "Johnson",
                age:20
            }
            resolve(data)}, 7000);
    } else {
        setTimeout(()=>reject("сервер не доступен!"), 3000);
    }
});

//console.log(data);

// обработка результата
promise.then(
    function(data){
        console.log("Запрос выполнен успешно ");
        console.log(data);
    }
)
promise.catch(
    function(error){
        console.log("Сервер вернул ошибку ");
        console.log(error);
    }
)

console.log("Команды далее");