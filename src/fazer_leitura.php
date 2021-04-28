<?php

    echo("Calculadora teste em PHP...")

    function calcularSoma($valor1, $valor2) {
        $valor3 = $valor1 + $valor2;
        return $valor3;
    }

    function calcularMultiplicacao($valor1, $valor2) {
        $result = $valor1 * $valor2;
        return $result;
    }

    function calcularSubtracao($valor1, $valor2) {
        $result = $valor1 - $valor2;
        return $result;
    }

    function calcularDivisao($valor1, $valor2) {
        $result = $valor1 / $valor2;
        return $result;
    }

    $resultado = calcularSoma(1, 2);

    for ($x = 0; x <= $resultado; $x++) {

       if ($x > 1) {
         $resultadoSoma = calcularSoma($x, 2);
         $resultadoMultiplicacao = calcularMultiplicacao($x, 2);
         $resultadoMultiplicacao = calcularMultiplicacao($x, 2);
         $resultadoSubtracao = calcularSubtracao($x, 2);
         $resultadoDivisao = calcularDivisao($x, 2);
         echo($resultado)
       }
    }

?>