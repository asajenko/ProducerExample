package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url '/users'
    }
    response {
        status OK()
        body(List.of(["id": 1, "name": "Adam"],["id": 2, "name": anyNonBlankString()]))
    }
}
