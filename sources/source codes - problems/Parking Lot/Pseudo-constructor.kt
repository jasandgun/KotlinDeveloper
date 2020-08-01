class Point3D {
    var x: Int = 0
    var y: Int = 0
    var z: Int = 0
}

fun createPoint(x: Int, y: Int, z: Int): Point3D {
    val result = Point3D()
    result.x = x
    result.y = y
    result.z = z
    return result
}