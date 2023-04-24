import React from 'react'
import { useParams } from 'react-router-dom';

function Page():JSX.Element{
    const param=useParams(); 

    return (
        <>
        <h1>
            страница {param.id}
        </h1>
        <p>
            отправляем запрос на сервер:  страниц №{param.id}
 
        </p>
        </>

    )
}
export default Page;