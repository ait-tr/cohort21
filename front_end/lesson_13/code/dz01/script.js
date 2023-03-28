/*
Пользователь на странице вводит (используйте например input text) скобочную последовательность (ну т.е. выражение содержащее скобки). Например так {[(12+3) + (11-1)] - [23-23]}  или просто скобки [(){}]. Ваша задача написать функцию, которая проверяет, что скобочная последовательность является корректной, т.е. каждой открывающей скобке соответствует закрывающая и нет нарушений вложенности скобок (например, не должно быть такого ({)}  )
Возможны 3 вида скобок: () {} []  или, если хотите, более простой вариант, только один вид скобок.
*/

// 1. если встретили открывающую скобку, в стэк кладем соотв. закрывающую 
// 2. если встретили ззакрывающую скобку, из стэка значение и сравниваем. если скобки не совпали -> неверная расстановка
// 3. если встретили не скобку - пропускаем

const btn= document.getElementById("btn_check");
btn.addEventListener("click", ()=>{
    const value = document.getElementById("input_area").value;
    let msg ="Скобки расставлены " + (checkParentheses(value) ? "правильно":"неправильно");
    const msgBlock = document.getElementById("msg-block");
    msgBlock.innerText= msg;
});



const checkParentheses = function(value){
    const stack=[];
    const openBrackets={};
    openBrackets["{"]="}";
    openBrackets["("]=")";
    openBrackets["["]="]";

    const closeBrackets={};
    closeBrackets["}"]="{";
    closeBrackets[")"]="(";
    closeBrackets["]"]="[";


    for(let i=0; i<value.length; i++){
        const char = value.charAt(i);
        if(char in openBrackets){
            stack.push(openBrackets[char]);
        } else if(char in closeBrackets){
            const lastCloseBracket = stack.pop();
            if (lastCloseBracket !== char) return false;
        }
    }
    return stack.length===0;
}

