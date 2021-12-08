food=[
        {"id":1,"menu":"Sandwich","price":"99.00","active":"Yes","date_of_launch":"2017-03-15","category":"Main course","free_delivery":"Yes",},
        {"id":2,"menu":"Burger","price":"129.00","active":"Yes","date_of_launch":"2017-12-23","category":"Main course","free_delivery":"No",},
        {"id":3,"menu":"Pizza","price":"149.00","active":"Yes","date_of_launch":"2017-08-21","category":"Main course","free_delivery":"No",},
        {"id":4,"menu":"French Fries","price":"57.00","active":"Yes","date_of_launch":"2017-07-02","category":"Deserts","free_delivery":"Yes",},
        {"id":5,"menu":"Chocolate Brownie","price":"32.00","active":"Yes","date_of_launch":"2017-11-02","category":"Starters","free_delivery":"Yes",}
    ]
cart=[];
function loadCartData(){
    cart=JSON.stringify(cart);
    localStorage.setItem("cartData",cart);
}
function loadMenuData(){
    food=JSON.stringify(food);
    localStorage.setItem("foodData",food);
}
function adminMenu(){
    if(localStorage.getItem("foodData")==null)
        loadMenuData();

    var foodItems=JSON.parse(localStorage.getItem("foodData"));
    
    document.getElementById("admin-menu-list").innerHTML=
    foodItems.map(i=>`<tr><td>${i.menu}</td>
    <td>Rs.${i.price}</td>
    <td>${i.active}</td>
    <td>${i.date_of_launch}</td>
    <td>${i.category}</td>
    <td>${i.free_delivery}</td>
    <td><a href="edit_menu.html" id="myId" onclick="return nextPage(${i.id});">Edit</a></td>
    </tr>`).join("");
    // console.log(ID);
    // <td><a href="nextPage(${i.id})" >Edit</a></td>
}
function customerMenu(){
    if(localStorage.getItem("cartData")==null)
        loadCartData();
    var foodItems=JSON.parse(localStorage.getItem("foodData"));
    document.getElementById("customer-menu-list").innerHTML=
    foodItems.map(i=>`<tr><td>${i.menu}</td>
    <td>${i.free_delivery}</td>
    <td>Rs.${i.price}</td>
    <td>${i.category}</td>
    <td><a href="#" onclick="return addToCart(${i.id});" id="myId2">Add to Cart</a></td>
    </tr>`).join("");
}
function addToCart(id){
    var b=id;
    localStorage.setItem("currId",b);
    var ID=localStorage.getItem("currId");
    document.getElementById("mssg").innerHTML=
    "<h4>Item added to Cart Successfully</h4>";
    // alert("added");
    // console.log("hii");
    var foodItems=JSON.parse(localStorage.getItem("foodData"));
    var cartItems=JSON.parse(localStorage.getItem("cartData"));
    console.log(foodItems[ID-1]);
    cartItems.push(foodItems[ID-1]);
    console.log(cartItems);
    localStorage["cartData"]=JSON.stringify(cartItems);
    return true;
}

function nextPage(id){
    // window.open("edit_menu.html",'_self');
    var a=id;
    // console.log(a);
    // console.log("*******");
    localStorage.setItem("currId",a);
    return true;
    // console.log(JSON.parse(localStorage.getItem("currId")));
    
}
function editItemPage(){
    var ID=localStorage.getItem("currId");
    var foodItems=JSON.parse(localStorage.getItem("foodData"));
    console.log(foodItems);
    // console.log(ID);
    var name=foodItems[ID-1].menu;
    // console.log(name);
    var price1=foodItems[ID-1].price;
    var active1=foodItems[ID-1].active;
     var dateOfLaunch1=foodItems[ID-1].date_of_launch;
    
    // dateOfLaunch1=dateOfLaunch1.split("-").reverse().join("/");
    // console.log(dateoflaunch1);
    var category1=foodItems[ID-1].category;
    var freeDelivery=foodItems[ID-1].free_delivery;
    document.getElementById("prodname").value=name;
    document.getElementById("price").value=price1;
    document.getElementById("dateOfLaunch").value=dateOfLaunch1;
    
    var cat=document.getElementById("category");
    for(i=0;i<cat.options.length;i++){
        
        // console.log(cat.options[i].value);
        // console.log(category1);
        if(cat.options[i].value===category1)
            {
                
                cat.options[i].selected=true;
                break;
            }
    }
    // document.getElementById("category").options.selected=cat;
    if(active1=="Yes")
        document.getElementById("active").checked=true;
    else
        document.getElementById("active").checked=true;
    if(freeDelivery=="Yes")
        document.getElementById("freeDelivery").checked=true;
    else
        document.getElementById("freeDelivery").checked=false;
}
function editFood(){
    var ID=localStorage.getItem("currId");
    var newFoodItems=JSON.parse(localStorage.getItem("foodData"));
    var newName=document.getElementById("prodname").value;
    var newPrice=document.getElementById("price").value;
    var newCategory="Deserts"
    // document.getElementById("");
    var newDateOfLaunch=document.getElementById("dateOfLaunch").value;
    // newDateOfLaunch=newDateOfLaunch.split("/").reverse().join("-");
    // console.log(newDateOfLaunch);
    if(document.getElementById("active").checked){
        var newActive = "Yes";
    }
    else
        newActive="No";
    if(document.getElementById("freeDelivery").selected)
        var newFreeDelivery="Yes";
    else
        newFreeDelivery="No";
    newFoodItems[ID-1].menu=newName;
    newFoodItems[ID-1].price=newPrice;
    newFoodItems[ID-1].date_of_launch=newDateOfLaunch;
    newFoodItems[ID-1].category=newCategory;
    newFoodItems[ID-1].active=newActive;
    newFoodItems[ID-1].free_delivery=newFreeDelivery;
    // newFoodItems=JSON.stringify(newFoodItems);
    // console.log(newFoodItems);
    // localStorage.setItem("foodData",JSON.stringify(newFoodItems));
    localStorage["foodData"]=JSON.stringify(newFoodItems);
    console.log("tyhhfjhyyvy");
    
    window.open("edit_item_status.html","_blank");
    // console.log("tyhhfjhyyvy");
}
function cartPage(){
    // console.log(JSON.parse(localStorage.getItem("cartData")).length);
    if(JSON.parse(localStorage.getItem("cartData")).length==0){
        console.log("hii");
        window.open("empty_cart.html","_self");
        }
    else{
       
        var cartItems1=JSON.parse(localStorage.getItem("cartData"));
        
        console.log(cartItems1);
        var total=0;
        // console.log(parseInt(cartItems1[0].price));
        cartItems1.map(i=>total=total+parseInt(i.price));
        document.getElementById("cart-table").innerHTML=
        cartItems1.map(i=>`<tr><td>${i.menu}</td>
        <td>${i.free_delivery}</td>
        <td>${i.price}</td>
        <td><a onclick="deleteFromCart(${i.id})">Delete</a></td>
        </tr>`).join("")+`<tr><td></td><td>Total</td><td >${total}</td><td></td></tr>`;
        // window.location.href="cart.html";
        
    }
}
function deleteFromCart(id){
    // console.log("hii");
    document.getElementById("mssg2").innerHTML="Item removed from Cart Successfully";
    var cartItems=JSON.parse(localStorage.getItem("cartData"));
    console.log(id);
    // cartItems.splice(id-1,1);
    for(i=0;i<cartItems.length;i++){
        if(cartItems[i].id==id){
            console.log(id);
            cartItems.splice(i,1);
        }
    }
    // cartItems.splice(id-1,1);
    console.log(cartItems);
    localStorage["cartData"]=JSON.stringify(cartItems);
    window.open("cart_notification.html","_self");
    // cartPage();
}
function cartNotificationPage(){
    cartPage();
}