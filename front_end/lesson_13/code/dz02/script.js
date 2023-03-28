/*

Реализовать на странице 2 поля для ввода: first name и last name и две кнопки:
next и finish. По нажатию на кнопку next ваша функция должна:
- создавать объект {firstName, lastName}  
- добавлять его в массив users 
По нажатию на кнопку finish на странице должны отображаться в виде списка все введенные пользователи.

*/

const nextBtn= document.getElementById("btn_next");
const finishBtn= document.getElementById("btn_finish");
const inputFirstName= document.getElementById("firstname");
const inputLastName= document.getElementById("lastname");
const users=[];



nextBtn.addEventListener("click", ()=>{
    const firstName = inputFirstName.value.trim();
    const lastName = inputFirstName.value.trim();
    if(firstName!=="" & lastName!==""){
        createUser(firstName,lastName);
        inputFirstName.value="";
        inputLastName.value="";
        console.log(users);
    }
});

finishBtn.addEventListener( "click",()=>printUsersList());



const createUser= function(firstName,lastName){
    if(firstName!=="" & lastName!==""){
        const user ={
            firstName,
            lastName
        };

        users.push(user);
    }
}

function printUsersList(){
    const resultBlock= document.getElementById("result");
    if(users.length>0){
        let html=`<h2>User List</h2><ol class="user-list">`;
        users.forEach((e)=>{
           html+=`<li>${e.firstName} ${e.lastName}</li>`     
        } );
        html+="</ol>";
        resultBlock.innerHTML=html;
    }
}
