import React from "react";
import {Outlet} from 'react-router-dom';
import { Link } from 'react-router-dom';



function Layoutlink():JSX.Element {

   

    return(

        <div>
            <h1> Мой сайт</h1>
            <div>
                <ul>
                    <Link to ="/users/">
                        <li>Пользователи</li>
                    </Link>
                    <Link to ="/posts/">
                        <li>Посты</li>
                    </Link>
                </ul>
            </div>
            <Outlet />
        </div>

    );
}

export default Layoutlink;