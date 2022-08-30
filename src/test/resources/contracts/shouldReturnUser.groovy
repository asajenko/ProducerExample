package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url '/users/10'
    }
    response {
        status OK()
        body(["id": 10, "name": "Adam"])
        headers {
            contentType(applicationJson())
        }
    }
}
