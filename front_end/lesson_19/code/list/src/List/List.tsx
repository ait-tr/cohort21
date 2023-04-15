import React, { useState, useEffect } from "react";
import styles from './List.module.css';
type Props ={
   names:string[],
   heading:string
};



function List({names,heading}:Props):JSX.Element {
  //let names: string[] = ["Jack", "John", "Lena", "Ann"];
  //names=[];

  const [selectedIndex, setSelectedIndex] = useState(0);
  const [value, setValue] = useState(0);

  
  useEffect(()=>{
    document.title=`${names[selectedIndex]}`;
    console.log("effect");
  });
  



  return (
    <>
      <h1 className={styles.qwe}>{heading}</h1>
      {/* names.length===0?<p>Нет студентов</p>:null */}
      {names.length === 0 && <p>Нет студентов</p>}
      <ul className="list-group">
        {names.map((strName: string, index: number) => (
          <li
            className={
              index === selectedIndex
                ? "list-group-item active"
                : "list-group-item" 
            }
            key={strName}
            onClick={() => {
              setSelectedIndex(()=>index);
              console.log(index, strName);
              //
            }}
          >
            {strName}
          </li> )
        )}
      </ul>
      <button type="button" 
      onClick={()=>{setValue(value+1);
                    console.log("hi");
                   }
      }>qwe</button>      

      
    <button type="button" 
      onClick={()=>{
        if(selectedIndex>0){
          setSelectedIndex(selectedIndex-1);
        } else {
          setSelectedIndex(names.length-1);
        }
                    //
    }
      }>Вверх</button>  


          <button type="button" 
      onClick={()=>{
        if(selectedIndex<names.length){
          setSelectedIndex(selectedIndex+1);
        } else {
          setSelectedIndex(0);
        }
            //        
    }
      }>Вниз</button>      

    </>
  );
}

export default List;
