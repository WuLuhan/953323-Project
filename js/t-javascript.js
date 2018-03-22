function fun(){

alert(numberCheck('hell',false))//id)

}

/* numberCheck(pId,pStatus)

 *检查是否为数字

 * 两个参数 1：dom结构的ID  2:true为小数 fale不是小数

 */  

function numberCheck(pId,pStatus){

  var tValue = document.getElementById(pId).value;

  var tFoamt = "";

  if(pStatus){

    tFoamt = /^\d+(\.\d+)?$/.test(tValue);

  }

  else{

    tFoamt = /^[0-9]*$/g.test(tValue);

  }

  if(tValue != ""){

    if(tFoamt){//輸入格式符合

      return true;

    }

    else{//輸入格式不符

      alert("輸入格式不符 !");

      document.getElementById(pId).value = "";

      return false;

    }

  }

}
