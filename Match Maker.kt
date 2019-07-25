fun main(){
    var x = 0
    var y = 0
    while (x < 5) {
        if ( y < 5 ){
            x++
            if( y < 3 ) x--
        }
        y = y + 3
        print("$x$y\n")
        x = x +1
    }
}