## Springboot app demo for vault in local and at pcf

This is simple springboot app. It run on local with running vault

###For running locally with local vault
1. Go to /Applications folder.
2. Run this command to run vault - ```./vault server -dev -dev-root-token-id=00000000-0000-0000-0000-000000000000```
3. Do the following for initial config
```sh
export VAULT_ADDR='http://127.0.0.1:8200'
./vault secrets disable secret
./vault secrets enable -version=1 -path=secret kv
```
4. Go inside vault by ui at ```http://localhost:8200/ui/vault```
5. Enter the token value as ```00000000-0000-0000-0000-000000000000```
6. Enter secret as ```vault-demo``` and key as ```vaultSecret2``` and enter any string as value
7. Hit the endpoint localhost:8080/secret




 

 
 