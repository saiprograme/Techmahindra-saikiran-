var num=parseInt(prompt("Enter the number"));
var falg=false;
if(num==1)
    document.write("1 is neither Prime nor Consonant");
for(let i=2;i<=Math.sqrt(num);i++){
    if(num%i==0){
        document.write(n + " is not a Prime Number");
        flag=true;
        break;
    }
}
if(flag==false)
    document.write(n + " is a Prime Number");