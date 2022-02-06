# How to Use
- run `bash build-all.sh` in *code*
- run `bash run-default ../code/` in *FederationA*
- run `bash run-default ../code/` in *FederationB*

# Notes
- the common federate was removed from `FederationA/run-default.sh`
- the port number for the federation manager was changed in `FederationB/run-default.sh`
- the port number for the federation manager was changed in `FederationB/conf/fedmgrconfig.json`
- the output for the common federate will be stored only in the `FederationB/logs/` directory

