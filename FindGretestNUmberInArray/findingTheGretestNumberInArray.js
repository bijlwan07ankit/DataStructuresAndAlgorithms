// const arr=[3,5,7,6,9,2,10];
function findGretestNumberInArray(arr,n){
    let target =arr[0];   
    for(let i=0;i<arr.length;i++){
        if(arr[i]>target){
            target=arr[i];
        }
        
    }
    return target;

}
