/*

//parentElement.style.font-size ="19px"; // error
parentElement.style.fontSize ="19px";    // ok camelCase
parentElement.style.cssText = "font-size:19px; marggin:auto;";

*/


/*
        <div class="news">
            <div class="tag">Здоровье</div>
            <a href="https://ait-tr.de" target="_blank">
                <h3 class="news-title header">О пользе прогулок для котят младшего возраста ... </h3>
            </a>
            <div class="time">17:21</div>
        </div>
*/

/*
// Добаввление элемента
const element= document.createElement("div");
const text = document.createTextNode("Test");
element.setAttribute("class", "tag");
element.appendChild(text);
document.body.appendChild(element);
*/

const strTag="Новость";
const strUrl="https://ait-tr.de";
const strHeader="Новая Новость";
const strTime="18:18";

////


const news = document.createElement("div");
news.setAttribute("class", "news");

// div tag
const tag = document.createElement("div");
tag.setAttribute("class", "tag");
//const text = document.createTextNode(strTag);
//tag.appendChild(text);
tag.textContent=strTag;
news.appendChild(tag);

//a
const link = document.createElement("a");
link.href=strUrl;
link.target="_blank";

//h3
const headeer = document.createElement("h3");
headeer.textContent=strHeader;
headeer.classList.add("news-title","header");
link.appendChild(headeer);

news.appendChild(link);

const time = document.createElement("div");
time.classList.add("time");
time.textContent=strTime;
news.appendChild(time);

const days = document.getElementsByClassName("day");
days[0].appendChild(news);

//    [опорный элемент].insertAdjacentElement(" ", [блок]);
// - beforebegin перед опорным блоком
// - afterbegin в начало опорного блока
// - beforeend в конец опорного блока
// - afterend за опорным блоком


const pNews= days[0].querySelector(".date");
pNews.insertAdjacentElement("afterend",news);

//document.body.appendChild(news);

let s="qwertyuiop["; // строка
let s1='qwertyuiop['; // строка

const htmlBlok = `
    <div class="news">
        <div class="tag">${strTag}</div>
            <a href="${strUrl}" target="_blank">
                <h3 class="news-title header">${strHeader}</h3>
            </a>
        <div class="time">${strTime}</div>
    </div>
`;

pNews.insertAdjacentHTML("afterend",htmlBlok);

/*
Let baseElement = getBy......
baseElement.prepend();
baseElement.append();
baseElement.insertBefore();

*/

document.querySelector("#btn1").addEventListener("click", ()=>{
  //pNews.style.cssText="background-color: green;";  
  pNews.style.backgroundColor = "green";  
}
);

let n=10;
console.log(n);
console.log(typeof n);

n="qwerty";
console.log(n);
console.log(typeof n);

n=console;
console.log(n);
console.log(typeof n);


let j=Symbol("id");
let j1=Symbol("id");
console.log(j1==j);

let n1=10;
let n2="10";
console.log("****************************************");
console.log(n1==n2); // не строгое сравнение
console.log(n1===n2); // строгое сравнение

console.log("****************************************");
console.log(n1+n2); 
console.log(n1-n2);




