v = [1:5;]
try
    v[6]
catch BoundsError
    println("Fora do limite do vetor")
finally
    println("Sempre executa")
end