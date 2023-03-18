console.log("hello JavaScript");
//alert("alert hello JS ");
console.log("2"+5);
//console.dir(console);

let a=20;
console.log(a); // a - переменная число
a="string value";
console.log(a); // a-string value


const b="string1";
console.log(b);

/*
b="qwert";    // Uncaught TypeError: Assignment to constant variable. -> const
console.log("hello");
*/


//  получение элемента по ID
let header= document.getElementById("idh1");
console.log(header);
console.dir(header);
header.innerText+= "  Super!!!";

// получение ээлементов по классу
let pWithClassNormalText= document.getElementsByClassName("normal-text");
console.log(pWithClassNormalText);
//console.log(pWithClassNormalText[1]);

for(let index=0; index<pWithClassNormalText.length; index++){
    const element=pWithClassNormalText[index];
    console.log(element);
    element.innerHTML=" [" + index + "] " + element.innerHTML;
}


// по имени тега
console.log(document.getElementsByTagName("p"));


// получение элементов по css селектору
console.log("-".repeat(30)+" querySelectorAll() " + "-".repeat(30));
let pWithClassNormalText2 = document.querySelectorAll(".normal-text");
    pWithClassNormalText2.forEach((element)=>{
        console.log(element);
        if(element.textContent.length>100){
         element.setAttribute("class","selected-text"); // изменение класса элементтов
        }
    }
)


pWithClassNormalText2[2].style.width="400px";
pWithClassNormalText2[2].style.cssText="margin:auto; color:red; width:200px;";

const newParagraph = document.createElement("p");
const text = document.createTextNode("Текстовое содержание нового абзаца");
newParagraph.appendChild(text);
document.body.appendChild(newParagraph);


const newParagraph1 = document.createElement("p");
const text1 = document.createTextNode("Текстовое содержание нового абзаца для нашего нового блока");
newParagraph1.appendChild(text1);
document.getElementById("qwe1").appendChild(newParagraph1);



