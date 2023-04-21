import React, { useEffect } from "react";
//import styles from './Posts.module.css';
import {useState} from 'react';
import List from "../List/List";

interface Post{
    id: number;
    userId:number;
    title: string;
    body: string;
}


function Userposts():JSX.Element {

    const id:number = 1;
    const [posts, setPosts] = useState<Post []>([]);

    async function loadPosts(): Promise<Post[]>{
        const response =await fetch(`https://jsonplaceholder.typicode.com/posts/?userId=${id}`);
        const obj: Post[] = await response.json() as Post[];
        //const strings:string[] =  obj.map( (post:Post):string=>{return post.body;}         );

        return obj;

    }  
    

   /* 
    async function loadPosts1(): Promise<Post[]>{
        const response =await fetch("https://jsonplaceholder.typicode.com/posts");
        const obj: Post[] = await response.json() as Post[];
        return obj;

    }
    */  
    
    useEffect( () => {
        loadPosts().then(posts=> setPosts(posts));
    },[]);

    

    const names:string[] =  posts.map( (post:Post):string=>{return post.body;}); 
    return (
        <div>
            <h1 >
                qwe temp
            </h1>
            <List  names={names} heading="Посты"/>   

        </div>
        
    );


}
export default Userposts;
