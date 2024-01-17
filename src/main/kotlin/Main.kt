fun main(args: Array<String>) {
//    classWork()
    honeWork();
}

fun classWork(){
    println("Class work 6");
    //ООП принципы на практике (наследование, инкопсуляция, полиоморфимзм)

    abstract class Technology () {
        abstract var ram:Int
        abstract var cpu:String;
        abstract  fun callToFriend ();

    }

    open class Electoniccs(): Technology () {
         var color = ""
        override var ram: Int = 0;

        override var cpu: String = "Default cpu";

        override fun callToFriend() {
            println("____")
        }
        open fun charge(){
            println("It is chargen");
        }
    }

    class Laptop(): Electoniccs(){
        //Модификаторы доступа private, protected, internal, public
        // Модификаторы доступа в java private, protected, default, public
        private var display = 14;
        override var ram = 16;
        private val gpu = "radeon 680m"
        override var cpu = "amd ryzen 9";
        public var price = 200;
        init {
            color = "red";
        }

        public fun setDisplay(value:Int){
            display = value
        };

        public fun getDisplay():Int{
            return display
        };

//        public fun setRam(value:Int){
//            ram = value;
//        };
//        public fun getRam():Int{
//            return  ram
//        }

        override fun callToFriend (){
            println("Laptop is turned or");
            println("Open is browser");
            println("Visit a website");
            println("Make a call");
        }

        override fun charge(){
            super.charge();
            super.callToFriend()
            println(super.cpu)
            println("Comp is charging ")
        }


    }

    class  Phone(): Electoniccs(){
        var camera = 0
            get() = field
            set(value){
                if(value <15){
                    field = 3
                }else{
                    field = 7

                }
            }

        fun getCameraValue():Int{
            return 20
        }

        init {
            color = "green";
            ram = 16
            cpu = "SharpDragon"
            println("Camera: $camera")
        }


        override fun callToFriend (){
            println("Phone is turned or");
            println("Open is contacts");
            println("Make a call");
        }
        override fun charge(){
            println("Phone is charging")
        }
    }

    val comp = Laptop();
    println("display ${comp.getDisplay()}, ram: ${comp.ram}, price ${comp.price}");
//    comp.setRam(32);
    comp.price = 300;
    println("display ${comp.getDisplay()}, ram: ${comp.ram}, price ${comp.price}");
    println("_________________________");
    val phone = Phone();
    comp.charge();
    println("_________________________");
    comp.callToFriend()
    println("_________________________");
    phone.charge();
    println("_________________________");
    phone.callToFriend();

    phone.camera = 6
    println(phone.camera)

}

fun honeWork(){
    abstract class Transport () {
        abstract val name:String;
        abstract  val speed:Int;
        abstract  val passengerCapacity:Int;

        abstract  fun getName();
        abstract  fun getSpeed();
        abstract  fun getPassengerCapacity();
    }

    class Train(_name:String, _speed:Int, _passengerCapacity:Int ) : Transport(){
        override val name = _name;
        override val speed = _speed;
        override val passengerCapacity = _passengerCapacity;

        override fun getName() {
            println("Train name: $name ");
        };
        override fun getSpeed() {
            println("Train speed: $speed ");
        }

        override fun getPassengerCapacity() {
            println("Train passenger capacity: $passengerCapacity ");
        }
    }

    class Plane(_name:String, _speed:Int, _passengerCapacity:Int ) : Transport(){
        override val name = _name;
        override val speed = _speed;
        override val passengerCapacity = _passengerCapacity;

        override fun getName() {
            println("Plane name: $name ");
        };
        override fun getSpeed() {
            println("Plane speed: $speed ");
        }

        override fun getPassengerCapacity() {
            println("Plane passenger capacity: $passengerCapacity ");
        }
    }

    class Ship(_name:String, _speed:Int, _passengerCapacity:Int ) : Transport(){
        override val name = _name;
        override val speed = _speed;
        override val passengerCapacity = _passengerCapacity;

        override fun getName() {
            println("Ship name: $name ");
        };
        override fun getSpeed() {
            println("Ship speed: $speed ");
        }

        override fun getPassengerCapacity() {
            println("Ship passenger capacity: $passengerCapacity ");
        }
    }

    val snowpiercer = Train(
        _name = "Snowpiercer",
        _speed = 400,
        _passengerCapacity = 2500
    )
    snowpiercer.getName();
    snowpiercer.getSpeed();
    snowpiercer.getPassengerCapacity();

    val airForceOne = Plane(
        _name = "Air force One",
        _speed = 890,
        _passengerCapacity = 400
    )
    airForceOne.getName();
    airForceOne.getSpeed();
    airForceOne.getPassengerCapacity();

    val poseidon = Ship(
        _name = "Posedion",
        _speed = 60,
        _passengerCapacity = 1500
    )
    poseidon.getName();
    poseidon.getSpeed();
    poseidon.getPassengerCapacity();

    open class Fasteners(){
        open var radius:Int = 0

        open fun getRadius(){
            println("Radius: $radius")
        }
    }

    class  Bolt3(_radius:Int): Fasteners(){
        override var radius  = _radius
            get() = field;
            set(value){
                if(value >3){
                    field = 3
                }
                if(value < 0){
                    field = 0
                }
                field = value
            }

        override fun getRadius() {
            println("Radius bol 3 : $radius, init radius: ${super.radius} ")
        }
        fun setBoltRadius(number:Int){
            this.radius = number
        }

    }

    var flag = true;
    val bolt = Bolt3(_radius = 2)
    while (flag){
        print("Radius bolt 3: ")
        val radius = readln();
        try{
            bolt.getRadius();
            bolt.radius = radius.toInt()
            bolt.getRadius();
            flag = false;

        }catch (ex: NumberFormatException){
            println("Radius is not number")
        }
    }
}

