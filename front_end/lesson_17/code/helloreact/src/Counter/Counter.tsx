import React , {useState} from 'react';
import Message from '../Message/Message';
import './Counter.css';

function Counter(){
    //console.log(useState(0));
    const [count, setCount] = useState(0);
    const msg:string =" раз";

    function counterIncreaseHandler():void {
        setCount(count+1);
    }
    function counterSetZerroHandler():void {
        setCount(0);
    }

    return (
        <div>
            <h1>Counter</h1>
            <p>Вы нажали {count}{msg}</p>
            <button onClick={counterIncreaseHandler} type='button'>Нажми меня</button>
            <button onClick={counterSetZerroHandler} type='button'>Обнулятор</button>
            <Message num={count} msg1="Привет из коунтера"/>
        </div>
    )
}


export default Counter;