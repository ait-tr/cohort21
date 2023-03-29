const url= "https://aws.random.cat/meow"
const btnNext = document.querySelector("#btn-next");
const catImg = document.querySelector("#cat-img");

console.log(btnNext);
console.log(catImg);

function getLinkToImage(){
    return new Promise( function(resolve, reject){
        
        const responsePromise= fetch(url);
        
        responsePromise.then((responseData)=>{
             console.log(responseData);   
             
             responseData.json().then((data)=> {
                console.log(data);
                resolve(data.file);    
             })  
        });
    } );
}

function changeImage(){
    const isDone= catImg.complete;
    if(isDone){
        getLinkToImage().then((data)=>{
        catImg.src=data;     
        });
    };
}

btnNext.addEventListener("click", changeImage);
