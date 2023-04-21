import React,{useState, useEffect} from "react";
import List from '../List/List';

interface User {
    id: number;
    name:string;
    username: string;
    email: string;
}

function Users():JSX.Element{

    const[users, setUsers] = useState<string[]>([])

     async function loadUsers(): Promise<string[]> {
        const response = await fetch('https://jsonplaceholder.typicode.com/users');
        const obj:User[]  = await response.json() as User[];
        const  names:string[] = obj.map((user)=> {return user.name});       
        return names;
     }

     useEffect( () => {
        loadUsers().then(names=> setUsers(names));
        console.log("qwertyuiop");
     },[]); 


    return (
        <div>
            <List names={users} heading="Пользователи"/>
        </div>
    );
}
export default Users;