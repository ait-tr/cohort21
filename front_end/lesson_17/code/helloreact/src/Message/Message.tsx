
type ParamTypeName ={num:number, msg1:string};

function Message(arg:ParamTypeName) {
    return (
        <div>
            <p> bla bla ... но вы нажали {arg.num} раз. {arg.msg1}</p>
        </div>
    );
}
export default Message;