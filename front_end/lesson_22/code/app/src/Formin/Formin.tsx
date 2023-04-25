import React, {useState} from 'react'
import { useNavigate } from 'react-router-dom';


function Formin():JSX.Element{

    const [value, setValue] = useState("");
    const navigate = useNavigate();

    const handleChange = (e : React.FormEvent<HTMLInputElement>)=> setValue(e.currentTarget.value);
    const handleSubmit = (e : React.FormEvent<HTMLFormElement>)=>{
        e.preventDefault();
        console.log(`/page/${value}`);
        navigate(`/page/${value}`);    // /page/1   /page/44   /page/332  
        setValue('')
    }

    return(
        <>
            <form onSubmit={handleSubmit}>
                <label>
                    Page:
                    <input
                        type="text"
                        value={value}
                        onChange={handleChange}
                    />
                </label>
                <input type="submit" value="Перейти" />
            </form>
        </>
    );
}
export default Formin; 