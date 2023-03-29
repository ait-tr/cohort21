function createSchoolObject(){
const school = {};

    return new Promise( (resolve, reject) => {
        setTimeout(()=> {
            school.title="ait-tr";
            console.log(0, school); 
            resolve(school);
        }, 1_000)}).then( (school) =>{
            return new Promise((resolve, reject) =>{
                setTimeout(()=> {
                    school.site="ait-tr.de";
                    console.log(1, school); 
                    resolve(school);
                }, 1_000); 
            });
        }).then((school) => {
            return new Promise((resolve, reject) =>{
                setTimeout(()=> {
                    school.email="info@ait-tr.de";
                    console.log(2, school); 
                    resolve(school);
                }, 1_000); 
            });
            
        }).then((school) =>{
            return new Promise((resolve, reject) =>{
                const value = confirm("Подтвердите создание объекта");
                if(value){
                    resolve(school);   
                } else {
                    reject("отказ от создания");
                };
            });
        });
}   


const promise = createSchoolObject();
promise.then((school=>{
    console.log(school);
}));
promise.catch((error)=> console.log(error));








