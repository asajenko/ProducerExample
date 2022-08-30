package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url '/users/100'
    }
    response {
        status NO_CONTENT()
    }
}
