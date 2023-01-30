import java.sql.Connection
import java.sql.DriverManager

class Database {
    private var connection: Connection? = null

    private var host = "ec2-54-194-211-183.eu-west-1.compute.amazonaws.com"
    private var database = "dcjm2kbmje66s8";
    private var port = 5432;
    private var user = "mhnganfdekcatz";
    private var pass = "a3c2b25ed0249caad3d50afb25d8169e14137fef6f16f26f7292f6952c5b3dd2";
    private var url = "postgres://mhnganfdekcatz:a3c2b25ed0249caad3d50afb25d8169e14137fef6f16f26f7292f6952c5b3dd2@ec2-54-194-211-183.eu-west-1.compute.amazonaws.com:5432/dcjm2kbmje66s8"
    private var status = false

    init {
        url = String.format(url, host, port, database)
        connect()
        //this.disconnect();
        println("connection status:$status")
    }

    private fun connect() {
        val thread = Thread {
            try {
                Class.forName("org.postgresql.Driver")
                connection = DriverManager.getConnection(url, user, pass)
                status = true
                println("connected:$status")
            } catch (e: Exception) {
                status = false
                print(e.message)
                e.printStackTrace()
            }
        }
        thread.start()
        try {
            thread.join()
        } catch (e: Exception) {
            e.printStackTrace()
            status = false
        }
    }

    val extraConnection: Connection?
        get() {
            var c: Connection? = null
            try {
                Class.forName("org.postgresql.Driver")
                c = DriverManager.getConnection(url, user, pass)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return c
        }
}