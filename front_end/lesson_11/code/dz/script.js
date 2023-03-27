

document.getElementById("btn-increase").addEventListener("click", 
    ()=>{
        const blocks = document.querySelectorAll(".block");
        blocks.forEach((e) => {
            let fs=window.getComputedStyle(e).fontSize;
            fs=parseInt(fs)+1 +"px";
            e.style.fontSize=fs;

        });
    }

);

document.getElementById("btn-decrease").addEventListener("click",
    ()=>{
        const blocks = document.querySelectorAll(".block");
        blocks.forEach((e) => {
            let fs=window.getComputedStyle(e).fontSize;
            fs=parseInt(fs)-1 +"px";
            e.style.fontSize=fs;
        });
    }

);