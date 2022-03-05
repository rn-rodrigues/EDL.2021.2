v = [4,6,2,5]

println(1 .<= v .<= 7)
if all(1 .<= v .<= 7)
    println("v está entre 1 e 7")
end

for i in v
    println(i)
end

while true
    println("Nunca iria parar")
    break
end
