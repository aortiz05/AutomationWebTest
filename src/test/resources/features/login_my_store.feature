#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Login exitoso con usuario correcto y clave correcta
    Dado estoy en la página de la tienda
    Cuando me logueo con mi usuario "aortiz@gmail.com" y clave "aortiz@0123"
    Entonces valido autenticación correcta de "arlet ortiz"
    Y cierro sesion