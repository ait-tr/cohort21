function demo(){
    return "hi";
}

console.log(demo());
console.log(typeof demo());

console.log("----------- demo 2 ------------");
 async function demo2(param){
    if (param===0) {
        throw new Error("Кривой параметр был прислан.");
    }
    return "hi";
}

console.log(demo2());
console.log(typeof demo2());


const d2= demo2(0); /// 0 в параметре - ошибка
d2.then(
   (data)=>{      // callback for normal flow
        console.log("callback for normal flow");
        console.log(data);
   },     
   (err)=>{ // calback for reject
    console.log("calback for reject");
    console.log(err);
   }         
); 
/*
.catch(
    (err)=>{ // calback for reject
        console.log("calback for reject 222222222");
        console.log(err);
       }         
    
)
*/

async function promiseHandler(promFunction, param1){
    try{
     const d3 = await demo2(param1);
     console.log("------------ promiseHandler ----")
     console.log(d3);
     
    } catch(e){
        console.log("-----------error случился но был обезврежен-----------------------")
    }

}

promiseHandler(demo2, 0);