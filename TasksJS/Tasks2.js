var num=parseInt(prompt("Enter the number"));
var res=1;
for(let i=1;i<=num;i++){
    res=res*i;
}
document.write("The factorial of the number is:"+res);