let num=1234567899876246776678929876543456789n;
console.log(num);

let lang="JavaScript";
let str= `${lang} is the best`;
console.log(str);

console.log(""+5+8); // 58 
console.log(""-1+3); // 2 
console.log(Number("")); //0
console.log(Number(true)); //1
console.log(Number(10+true)); //11
console.log(+(10+true)); //11
console.log(99/"33"); //3
console.log(4+3+"px"); //"7px"
console.log(""+5-8); // -3 
console.log(typeof(""+5-8)); // number
console.log("40px"+2); //  40px2
console.log("40px"-2); //  NaN
console.log(parseInt("40px")-2); //  38



const arr=[1,4,9];
console.log(arr);
console.log("Len=" + arr.length);


const arr2 = new Array(10,7,8,6);
console.log(arr2);
console.log(typeof arr);

console.log("  ---------------- print arr12");
for (let index = 0; index < arr2.length; index++) {
    console.log(arr2[index]);
}

arr[0] = 23456;
console.log(arr);

arr[3]=890;
console.log(arr);

arr[10]=765;
arr[11]="string value";
console.log(arr);
console.log("------------- arr with length 10");
for (let index = 0; index < arr.length; index++) {
    console.log(arr[index]);
}

console.log("------------------ length ------------------------------");
console.log(arr.length);
arr.length=100;
console.log(arr.length);
console.log(arr);
console.log("-------- назад");
arr.length=2;
console.log(arr.length);
console.log(arr);
console.log("-------------------------------------------");
for (let index = 0; index < arr.length; index++) {
    console.log(arr[index]);
}
console.log("-------------- len 50");
arr.length=50;
console.log(arr.length);
console.log(arr);
console.log("-------------------------------------------");
for (let index = 0; index < arr.length; index++) {
    console.log(arr[index]);
}

console.log("------ arr.at -----");
const names=["jack","john", "ann"];
console.log(names.at(0));
console.log(names.at(1));
console.log(names.at(-1));

console.log("-----------------------------------------");
for(let name of names){
    console.log(name);
}

// Так не делать!
names.qwe="new Str";
console.log(names);

for(let name in names){
    console.log(name);
}
console.log("----------------------------- push pop shift unshift -------");
names.push("lena"); //добавит в конец
console.log(names);
let qwe= names.pop(); // забрать последний эл.
console.log(names);
console.log(qwe);
qwe= names.pop();
console.log(names);
console.log(qwe);
names.unshift("nick"); //добавит в начало
console.log(names); 
names.shift("nick"); // забрать первый эл.
console.log(names);
console.log(qwe);






















































